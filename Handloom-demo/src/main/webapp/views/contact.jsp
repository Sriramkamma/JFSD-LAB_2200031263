<%@ include file="navbar.jsp" %>
<div class="container mx-auto mt-8">
    <h2 class="text-3xl font-bold text-center mb-4">Contact Us</h2>
    <form action="submitContact" method="POST" class="max-w-md mx-auto">
        <label class="block mb-2">Name:</label>
        <input type="text" name="name" class="border p-2 w-full mb-4">
        
        <label class="block mb-2">Email:</label>
        <input type="email" name="email" class="border p-2 w-full mb-4">
        
        <label class="block mb-2">Message:</label>
        <textarea name="message" class="border p-2 w-full mb-4"></textarea>
        
        <button type="submit" class="bg-blue-600 text-white px-4 py-2 rounded">Send Message</button>
    </form>
</div>
<%@ include file="footer.jsp" %>
