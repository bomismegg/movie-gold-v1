import axios from "axios";

export default axios.create({
    baseURL:'https://4d6e-116-100-44-169.ngrok-free.app',
    headers:{"ngrok-skip-browser-warning":"true"}
});