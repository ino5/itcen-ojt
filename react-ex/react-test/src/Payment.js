/* 위 소스를 구조 분해 할당으로 구현 */
import React from 'react';

function Payment({ color, amount, isSpecial }) {
    return (
        <div>
            <br />
            { isSpecial ? <b>*</b> : null}
            감사합니다! 결제금액은 <div style={{color}}><b>{amount}</b></div> 입니다.
        </div>
    );
}

export default Payment;