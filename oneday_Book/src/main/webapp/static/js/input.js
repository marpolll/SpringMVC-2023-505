// HTML DOM 기반의 JS 코드 시작점
document.addEventListener("DOMContentLoaded", () => {
  // div.message 의 index 변수
  const INDEX = {
    CODE: 0,
    NAME: 1,
    AUTHER: 2,
    COMP: 3,
    YEAR: 4,
    IPRICE: 5,
    RPRICE: 6,
  };
  const form_book =
    document.querySelector("form.main.input") ||
    document.querySelector("form.main.update");

  const input_code = form_book?.querySelector("input[name='b_code']");

  const input_name = document.querySelector("input[name='b_name']");
  const input_auther = document.querySelector("input[name='b_auther']");
  const input_comp = document.querySelector("input[name='b_comp']");
  const input_year = document.querySelector("input[name='b_year']");
  const input_iprice = document.querySelector("input[name='b_irpice']");
  const input_rprice = document.querySelector("input[name='b_rprice']");

  const btn_input = document.querySelector("button.input");
  const btn_list = document.querySelector("button.list");

  const msg_boxs = document.querySelectorAll("div.message");

  const message_view = (index, className, message) => {
    const msg_box = msg_boxs[index];
    msg_box?.classList.remove("ok");
    msg_box?.classList.remove("error");

    msg_box?.classList.add(className);
    msg_box.querySelector("span").innerHTML = message;
  };
  btn_list?.addEventListener("click", (e) => {
    document.location.href = `${rootPath}`;
  });

  const inputButtonClickHandler = (e) => {
    for (let i = 0; i < msg_boxs.length; i++) {
      msg_boxs[i].classList.remove("ok");
      msg_boxs[i].classList.remove("error");
    }

    if (confirm("저장할까요?")) {
      form_book?.submit();
    }
  };
  btn_input?.addEventListener("click", inputButtonClickHandler);
});
