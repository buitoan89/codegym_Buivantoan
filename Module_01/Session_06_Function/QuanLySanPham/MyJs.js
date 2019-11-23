let khoHang = ['Sony Xperia', 'Samsung Galaxy', 'Nokia 6', 'Xiaomi Redmi Note 4', 'Apple Iphone 6S', 'Xiaomi Mi 5s Plus', 'Apple Iphone 8 Plus', 'Fujitsu F04-E', 'Oppo A71']


function hienThi() {
    let body = document.getElementById('body');
    let khung2 = document.getElementById('khung2');
    khung2.innerHTML = null;


    for (i = 0; i < khoHang.length; i++) {
        // Tạo ra ô col6 chứa tên sản phẩm
        let hang = document.createElement('div')
        hang.classList.add("row");
        hang.classList.add("mt-3");
        let col6 = document.createElement('div');
        col6.classList.add('col-6')
        let thePTenSP = document.createElement('p');
        let tenSP = document.createTextNode(khoHang[i]);

        thePTenSP.appendChild(tenSP);
        col6.appendChild(thePTenSP);
        hang.appendChild(col6);


        // Tạo ra ô col3 chứa button Edit
        let col3Edit = document.createElement('div');
        col3Edit.classList.add('col-3');
        let buttonEdit = document.createElement('button');
        buttonEdit.classList.add('btn');
        buttonEdit.classList.add('btn-success');
        let textButtonEdit = document.createTextNode('Edit');

        buttonEdit.appendChild(textButtonEdit);
        col3Edit.appendChild(buttonEdit);
        hang.appendChild(col3Edit);

        var att = document.createAttribute("value");
        att.value = khoHang[i];
        buttonEdit.setAttributeNode(att);

        var att2 = document.createAttribute("onclick");
        att2.value = 'editSP(this.value)';
        buttonEdit.setAttributeNode(att2);


        // Tạo ra ô col3 chứa button Delete
        let col3Delete = document.createElement('div');
        col3Delete.classList.add('col-3');
        let buttonDelete = document.createElement('button');
        buttonDelete.classList.add('btn');
        buttonDelete.classList.add('btn-success');
        let textButtonDelete = document.createTextNode('Delete');

        buttonDelete.appendChild(textButtonDelete);
        col3Delete.appendChild(buttonDelete);
        hang.appendChild(col3Delete);
        khung2.appendChild(hang);
        body.appendChild(khung2);

        var att = document.createAttribute("value");
        att.value = khoHang[i];
        buttonDelete.setAttributeNode(att);

        var att2 = document.createAttribute("onclick");
        att2.value = 'deleteSP(this.value)';
        buttonDelete.setAttributeNode(att2);
    }
}

function addThem() {
    let spAddThem = document.getElementById('spAddThem').value;
    khoHang.unshift(spAddThem);
    hienThi();
}


function deleteSP(x){
    for(i=0;i<khoHang.length;i++){
        if(x==khoHang[i]){
            khoHang.splice(i,1);
            break;
        }
    }
    hienThi();
}


function editSP(x){
    let giaTriMoi = prompt('Bạn muốn đổi tên SP "' + x + '" thành gì?');
    for(i=0;i<khoHang.length;i++){
        if(x==khoHang[i]){
            khoHang[i]=giaTriMoi;
            break;
        }
    }
    hienThi();

}