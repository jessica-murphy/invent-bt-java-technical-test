import { Router } from 'express';


// Export the base-router
const baseRouter = Router();

// Setup routers
baseRouter.get('/test', (request, response) => {
    response.send('Test');
});

// Export default.
export default baseRouter;
