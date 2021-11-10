import React from 'react';
import './App.css';
import ImportComponent from './ImportComponent'; /* 추가 */

function App() {
  return (
    <div>
      <h1>React는 자바스크립트 라이브러리의 하나</h1>
      <p>함수형 컴포넌트 생성하기</p>
      <ImportComponent></ImportComponent> {/* 재사용 */}
    </div>
  );
}
export default App;