document.addEventListener("DOMContentLoaded", () => {
  const input_carnum = document.querySelector("input[name='c_carnum']");
  const input_skm = document.querySelector("input[name='c_skm']");
  const input_qty = document.querySelector("input[name='c_qty']");

  input_carnum?.addEventListener("blur", (e) => {
    const value = e.target.value;
    const error_carnum = document.querySelector("div.error.c_carnum");
    if (!value) {
      error_carnum?.classList.add("on");
      error_carnum.innerHTML = "* 차량번호는 반드시 입력하세요";
      e.target.focus();
      e.target.select();
      return false;
    } else {
      fetch(`${rootPath}/car_check?carnum=${value}`) //요청
        .then((response) => response.json()) // 응답한 데이터중 JSON 만 추출
        .then((result) => {
          if (result?.c_carnum === "NOT") {
            error_carnum.classList.add("on");
            error_carnum.innerHTML = "* 없는 차량 번호 입니다.";
          } else {
            input_skm.value = result.c_skm;
            error_carnum.innerHTML = "";
          }
        });
    }
  });

  input_qty?.addEventListener("blur", (e) => {
    const value = e.target.value;
    if (!value) {
      const error_qty = document.querySelector("div.error.c_qty");
      error_qty.classList.add("on");
      error_qty.innerHTML = "* 업무구분은 반드시 입력하세요";
      e.target.focus();
      return false;
    }
  });
});

/*

 const server = async() => {
            const res = await fetch(`${rootPath}/car_check?carnum=${value}`)

            const result = await res.text();
            if (result?.c_carnum === "NOT") {
                error_carnum.classList.add("on");
                error_carnum.innerHTML = "* 없는 차량 번호 입니다.";
              } else {
                input_skm.value = result.c_skm;
              }

        }




*/
