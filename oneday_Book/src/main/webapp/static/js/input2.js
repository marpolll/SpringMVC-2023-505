// HTML DOM 기반의 JS 코드 시작점
document.addEventListener("DOMContentLoaded", () => {
  // div.message 의 index 변수
  const INDEX = {
    CODE: 0,
    NAME: 1,
    TEL: 2,
    ADDR: 3,
  };
  const form_user =
    document.querySelector("form.main.input") ||
    document.querySelector("form.main.update");

  const input_code = form_user?.querySelector("input[name='u_code']");

  const input_name = document.querySelector("input[name='u_name']");
  const input_tel = document.querySelector("input[name='u_tel']");
  const input_addr = document.querySelector("input[name='u_addr']");

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
    document.location.href = `${rootPath}/user`;
  });

  const inputButtonClickHandler = (e) => {
    for (let i = 0; i < msg_boxs.length; i++) {
      msg_boxs[i].classList.remove("ok");
      msg_boxs[i].classList.remove("error");
    }

    if (confirm("저장할까요?")) {
      form_user?.submit();
    }
  };
  btn_input?.addEventListener("click", inputButtonClickHandler);
});
