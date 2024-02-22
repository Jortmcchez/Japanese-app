import React from 'react';
import Link from 'next/link'

export default function Home() {
return (
  <div>
    <div class="border-2 border-Border rounded-lg mx-auto p-4 mx-auto my-10 flex justify-center items-center" style={{ width: '600px', height: '100px' }}>
      <button class="text-white text-lg mx-auto hover:text-gray-300"> 
      <Link href="/quiz">Flashcards</Link>
      </button>
    </div>
    <div class="mx-auto p-4 mx-auto my-40 flex justify-center items-center">
      Welcome to JappL, click the button above to start practising.
    </div>
  </div>
  );
};