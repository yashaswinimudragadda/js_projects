const btn = document.getElementById('btn');
const adviceText = document.querySelector('.advice-text');
const adviceId = document.getElementById('adive-title');

async function fetchAdvice() {
  try {
    // Adding a timestamp to the URL prevents the browser from caching the result
    const response = await fetch(`https://api.adviceslip.com/advice?t=${Date.now()}`);
    const data = await response.json();
    
    adviceId.innerText = data.slip.id;
    adviceText.innerText = `"${data.slip.advice}"`;
  } catch (error) {
    console.error("Error fetching advice:", error);
  }
}

btn.addEventListener('click', fetchAdvice);

// Load an initial quote on page load
window.onload = fetchAdvice;