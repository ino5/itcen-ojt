import React, { useState } from 'react'

function InputSample() {
    const [text, setText] = useState('');

    const a = text;

    const onChange = (e) => {
        setText(e.target.value);
        console.log(typeof(text));
    };

    const onReset = (e) => {
        setText('');
    };

    return (
        <div>
            <input onChange={onChange} value={text}/>
            <button onClick={onReset}>초기화</button>
            <div>
                <b>값: {text}</b>
                {a}
            </div>
        </div>
    );
}

export default InputSample;