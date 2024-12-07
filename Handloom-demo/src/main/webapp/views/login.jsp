<%@ include file="nav.jsp" %>
<div class="container mx-auto mt-8">
    <h2 class="text-3xl font-bold text-center mb-4">Login</h2>
    <form action="home" method="POST" class="max-w-md mx-auto">
        
        <label class="block mb-2">Username:</label>
        <input type="text" name="username" class="border p-2 w-full mb-4" required>
        
        <label class="block mb-2">Password:</label>
        <input type="password" name="password" class="border p-2 w-full mb-4" required>
        
        <button type="submit" class="bg-blue-600 text-white px-4 py-2 rounded mb-4">Login</button>
        
        <p class="text-center text-gray-600">Don't have an account? 
            <a href="singup" class="text-blue-600 underline">Sign up</a>
        </p>
    </form>
</div>
<%@ include file="footer.jsp" %>
