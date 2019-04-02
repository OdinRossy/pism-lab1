window.onload = function() {
    let btnAdd = document.getElementById('btn-add');
    let btnRemove = document.getElementById('btn-remove');
    let counter = 1;
    let container = document.getElementById('container-inputs');

    setInvisibleNode(btnRemove);

    btnAdd.onclick = function () {
        counter++;
        setVisibleNode(btnRemove);
        container.appendChild(createInputDiv());
    };

    btnRemove.onclick = function () {
        if (counter > 1) {
            setVisibleNode(btnRemove);
            container.removeChild(container.lastChild);
            counter--;
        }
        if (counter === 1) {
            setInvisibleNode(btnRemove);
        }
    };

    function createInputDiv() {
        let div = document.createElement('div');
        let input = document.createElement('input');
        div.setAttribute('class', 'container-input');
        input.setAttribute('type', 'number');
        input.setAttribute('class', 'input-number smooth-shadow');
        input.setAttribute('step', '0.0000001');
        input.setAttribute('name', 'num');
        input.setAttribute('placeholder', 'Введите число:');
        div.appendChild(input);
        return div;
    }

    function setInvisibleNode(el) {
        el.style = "opacity:0";
        el.style = "display:none";
    }

    function setVisibleNode(el) {
        el.style = "opacity:1";
        el.style = "display:inline-block";
    }
};