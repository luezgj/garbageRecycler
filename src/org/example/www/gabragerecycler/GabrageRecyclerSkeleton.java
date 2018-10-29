
/**
 * GabrageRecyclerSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package org.example.www.gabragerecycler;
    /**
     *  GabrageRecyclerSkeleton java skeleton for the axisService
     */
    public class GabrageRecyclerSkeleton{
    	
    	GarbageRecyclerModel model= new GarbageRecyclerModel();
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param addRecyclingUser 
             * @return addRecyclingUserResponse 
         */
        
         public org.example.www.gabragerecycler.AddRecyclingUserResponse addRecyclingUser
                  (
                  org.example.www.gabragerecycler.AddRecyclingUser addRecyclingUser
                  )
        {
        	 AddRecyclingUserResponse response= new AddRecyclingUserResponse(); 
                //TODO : fill this with the necessary business logic
        	 User user= model.findUser(addRecyclingUser.getUserName());
        	 
        	 if (user!=null) {
        		 
        	 }
                return response;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param registerUser 
             * @return registerUserResponse 
         */
        
                 public org.example.www.gabragerecycler.RegisterUserResponse registerUser
                  (
                  org.example.www.gabragerecycler.RegisterUser registerUser
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#registerUser");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getAllRecyclingsByUser 
             * @return getAllRecyclingsByUserResponse 
         */
        
                 public org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse getAllRecyclingsByUser
                  (
                  org.example.www.gabragerecycler.GetAllRecyclingsByUser getAllRecyclingsByUser
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getAllRecyclingsByUser");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getRecyclingByUser 
             * @return getRecyclingByUserResponse 
         */
        
                 public org.example.www.gabragerecycler.GetRecyclingByUserResponse getRecyclingByUser
                  (
                  org.example.www.gabragerecycler.GetRecyclingByUser getRecyclingByUser
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getRecyclingByUser");
        }
     
    }
    