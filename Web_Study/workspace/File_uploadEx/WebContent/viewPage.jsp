<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 추가 -->
<%@ page import="com.oreilly.servlet.MultipartRequest,
				 com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
				 java.util.*,
				 java.io.*"
%>

<%
	String savePath = "C:/FileUpload/filestorage";
	String encType = "UTF-8";
	int maxSize = 20 * 1024 * 1024;		// 파일의 사이즈를 최대 20MB 까지 제한
	
	// 반드시 예외처리 해야한다!!
	try {
		// MultipartRequest 클래스는 파일 업로드를 직접적으로 담당하는 클래스이다.
		MultipartRequest multi = null;
		
		multi = new MultipartRequest(request,
									 savePath, 
									 maxSize, 
									 encType, 
									 new DefaultFileRenamePolicy()); // 덮어쓰기 방지
									 
		String name = multi.getParameter("name");
		String subject = multi.getParameter("subject");
		
		out.println("작성자: " + name + "<br>");
		out.println("제   목: " + subject + "<br>");
		out.println("<br>");
		
		Enumeration files = multi.getFileNames();
		
		while (files.hasMoreElements()) {
			String fname = (String) files.nextElement();
			String original = multi.getOriginalFileName(fname);
			String filename = multi.getFilesystemName(fname);
			String type = multi.getContentType(fname);
			File f = multi.getFile(fname);
			
			out.println("파일 업로드 객체 이름: " + fname + "<br>");
			out.println("실제 파일 이름: " + original + "<br>");
			out.println("저장된 파일 이름: " + filename + "<br>");
			out.println("파일 타입: " + type + "<br>");
			
			if (f != null) {
				out.println("파일크기: " + f.length());
				out.println("<br>");
			}
		}
	} catch (Exception e) {
		System.out.println(e);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>