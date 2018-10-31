
/**
 * GabrageRecyclerSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.gabragerecycler;

/**
 * GabrageRecyclerSkeleton java skeleton for the axisService
 */
public class GabrageRecyclerSkeleton {

	final static GarbageRecyclerModel model = new GarbageRecyclerModel();

	/**
	 * Auto generated method signature
	 * 
	 * @param addRecyclingUser
	 * @return addRecyclingUserResponse
	 */

	public org.example.www.gabragerecycler.AddRecyclingUserResponse addRecyclingUser(
			org.example.www.gabragerecycler.AddRecyclingUser addRecyclingUser) {
		AddRecyclingUserResponse response = new AddRecyclingUserResponse();
		// TODO : fill this with the necessary business logic
		User user = model.findUser(addRecyclingUser.getUserName());

		if (user != null) {
			UserRecycling recycling = model.addUserRecycling(addRecyclingUser.getUserName(),addRecyclingUser.getUserRecycling());
			response.setOut(recycling);
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param registerUser
	 * @return registerUserResponse
	 */

	public org.example.www.gabragerecycler.RegisterUserResponse registerUser(
			org.example.www.gabragerecycler.RegisterUser registerUser) {
		// TODO : fill this with the necessary business logic
		RegisterUserResponse response= new RegisterUserResponse();
		User registered=model.addUser(registerUser.getIn());
		if (registered!=null)
			response.setOut(registered);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getAllRecyclingsByUser
	 * @return getAllRecyclingsByUserResponse
	 */

	public org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse getAllRecyclingsByUser(
			org.example.www.gabragerecycler.GetAllRecyclingsByUser getAllRecyclingsByUser) {
		GetAllRecyclingsByUserResponse response= new GetAllRecyclingsByUserResponse();
		String userName=getAllRecyclingsByUser.getUserName();
		Recycling out = model.getAllRecyclingsByUser(userName);
		response.setOut(out);
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getRecyclingByUser
	 * @return getRecyclingByUserResponse
	 */

	public org.example.www.gabragerecycler.GetRecyclingByUserResponse getRecyclingByUser(
			org.example.www.gabragerecycler.GetRecyclingByUser getRecyclingByUser) {
		GetRecyclingByUserResponse response= new GetRecyclingByUserResponse();
		String userName = getRecyclingByUser.getUserName();
		for (UserRecycling usrRec : model.getRecyclingByUser(userName)) {
			response.addUserRecyclings(usrRec);
		}
		return response;
	}

}
