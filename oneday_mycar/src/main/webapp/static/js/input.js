document.addEventListener("DOMContentLoaded", () => {
  const INDEX = {
    TITLE: 0,
    DDIS: 1,
    PLACE: 2,
    EDIS: 3,
    COST: 4,
  };

  const form_car =
    document.querySelector("form.main.input") ||
    document.querySelector("form.main.update");

  const input_no = form_car?.querySelector("input[name='c_no']");

  const input_title = document.querySelector("input[name='c_title']");
  const input_ddis = document.querySelector("input[name='c_ddis']");
  const input_place = document.querySelector("input[name='c_place']");
  const input_edis = document.querySelector("input[name='c_edis']");
  const input_cost = document.querySelector("input[name='c_cost']");

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

    if (input_title && !input_title.value) {
      message_view(INDEX.TITLE, "error", "* 구분은 반드시 입력해야 합니다.");
      input_title.focus();
      input_title.select();
      return false;
    }

    if (!input_ddis.value) {
      message_view(INDEX.DDIS, "error", "* 시작거리는 반드시 입력해야 합니다.");
      input_ddis.focus();
      input_ddis.select();
      return false;
    }

    if (!input_place.value) {
      message_view(INDEX.PLACE, "error", "* 장소는 반드시 입력해야 합니다.");
      input_place.focus();
      input_place.select();
      return false;
    }

    if (confirm("저장할까요?")) {
      form_car?.submit();
    }
  };
  btn_input?.addEventListener("click", inputButtonClickHandler);

  input_id.addEventListener("blur", async (e) => {
    const value = e.target.value;
    const idCheck_url = `${rootPath}/id_check?id=${value}`;

    if (!value) {
      message_view(INDEX.ID, "error", "* ID 는 반드시 입력해야 합니다.");
      input_id.focus();
      return false;
    }

    const response = await fetch(idCheck_url);
    const result = await response.text();
    if (result === "OK") {
      message_view(INDEX.ID, "ok", "* 사용 가능한 ID 입니다.");
    } else if (result === "FAIL") {
      message_view(INDEX.ID, "error", "* 이미 추가된 ID 입니다. 사용불가!!");
      input_id.focus();
    } else {
      message_view(INDEX.ID, "error", "* 서버오류. 알수없는 오류!!");
      input_id.focus();
    }
  });
});
