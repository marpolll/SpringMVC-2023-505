document.addEventListener("DOMContentLoaded", () => {
  const btn_list = document.querySelector("button.detail.list");
  const btn_update = document.querySelector("button.detail.update");
  const btn_delete = document.querySelector("button.detail.delete");

  btn_list?.addEventListener("click", () => {
    document.location.href = `${rootPath}/user`;
  });

  btn_update?.addEventListener("click", (e) => {
    const id = e.target.dataset.id;
    document.location.href = `${rootPath}/user/update?id=${id}`;
  });

  btn_delete?.addEventListener("click", (e) => {
    const btn = e.target;
    const id = btn.dataset.id;

    if (confirm("삭제한 데이터는 복구 할수 없습니다. /n 정말 삭제 할까요?")) {
      document.location.replace(`${rootPath}/user/delete?id=${id}`);
    }
  });
});
