
(function(){
    const btn = document.querySelector(".btn");
    
    btn.addEventListener("click",()=>{
        const pass = document.getElementById("password").value;
        const user = document.getElementById("userName").value;

        console.log("ボタンがクリックされました");
        console.log(user);
        console.log(pass);
    });
    

})();