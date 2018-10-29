
/**
 * GabrageRecyclerMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package org.example.www.gabragerecycler;

        /**
        *  GabrageRecyclerMessageReceiverInOut message receiver
        */

        public class GabrageRecyclerMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        GabrageRecyclerSkeleton skel = (GabrageRecyclerSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("addRecyclingUser".equals(methodName)){
                
                org.example.www.gabragerecycler.AddRecyclingUserResponse addRecyclingUserResponse17 = null;
	                        org.example.www.gabragerecycler.AddRecyclingUser wrappedParam =
                                                             (org.example.www.gabragerecycler.AddRecyclingUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gabragerecycler.AddRecyclingUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               addRecyclingUserResponse17 =
                                                   
                                                   
                                                         skel.addRecyclingUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), addRecyclingUserResponse17, false, new javax.xml.namespace.QName("http://www.example.org/gabrageRecycler/",
                                                    "addRecyclingUser"));
                                    } else 

            if("registerUser".equals(methodName)){
                
                org.example.www.gabragerecycler.RegisterUserResponse registerUserResponse19 = null;
	                        org.example.www.gabragerecycler.RegisterUser wrappedParam =
                                                             (org.example.www.gabragerecycler.RegisterUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gabragerecycler.RegisterUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               registerUserResponse19 =
                                                   
                                                   
                                                         skel.registerUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), registerUserResponse19, false, new javax.xml.namespace.QName("http://www.example.org/gabrageRecycler/",
                                                    "registerUser"));
                                    } else 

            if("getAllRecyclingsByUser".equals(methodName)){
                
                org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse getAllRecyclingsByUserResponse21 = null;
	                        org.example.www.gabragerecycler.GetAllRecyclingsByUser wrappedParam =
                                                             (org.example.www.gabragerecycler.GetAllRecyclingsByUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gabragerecycler.GetAllRecyclingsByUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getAllRecyclingsByUserResponse21 =
                                                   
                                                   
                                                         skel.getAllRecyclingsByUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getAllRecyclingsByUserResponse21, false, new javax.xml.namespace.QName("http://www.example.org/gabrageRecycler/",
                                                    "getAllRecyclingsByUser"));
                                    } else 

            if("getRecyclingByUser".equals(methodName)){
                
                org.example.www.gabragerecycler.GetRecyclingByUserResponse getRecyclingByUserResponse23 = null;
	                        org.example.www.gabragerecycler.GetRecyclingByUser wrappedParam =
                                                             (org.example.www.gabragerecycler.GetRecyclingByUser)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.gabragerecycler.GetRecyclingByUser.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getRecyclingByUserResponse23 =
                                                   
                                                   
                                                         skel.getRecyclingByUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getRecyclingByUserResponse23, false, new javax.xml.namespace.QName("http://www.example.org/gabrageRecycler/",
                                                    "getRecyclingByUser"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.AddRecyclingUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.AddRecyclingUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.AddRecyclingUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.AddRecyclingUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.RegisterUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.RegisterUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.RegisterUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.RegisterUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.GetAllRecyclingsByUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.GetAllRecyclingsByUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.GetRecyclingByUser param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.GetRecyclingByUser.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.gabragerecycler.GetRecyclingByUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.gabragerecycler.GetRecyclingByUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gabragerecycler.AddRecyclingUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gabragerecycler.AddRecyclingUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gabragerecycler.AddRecyclingUserResponse wrapaddRecyclingUser(){
                                org.example.www.gabragerecycler.AddRecyclingUserResponse wrappedElement = new org.example.www.gabragerecycler.AddRecyclingUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gabragerecycler.RegisterUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gabragerecycler.RegisterUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gabragerecycler.RegisterUserResponse wrapregisterUser(){
                                org.example.www.gabragerecycler.RegisterUserResponse wrappedElement = new org.example.www.gabragerecycler.RegisterUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse wrapgetAllRecyclingsByUser(){
                                org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse wrappedElement = new org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.gabragerecycler.GetRecyclingByUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.gabragerecycler.GetRecyclingByUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.gabragerecycler.GetRecyclingByUserResponse wrapgetRecyclingByUser(){
                                org.example.www.gabragerecycler.GetRecyclingByUserResponse wrappedElement = new org.example.www.gabragerecycler.GetRecyclingByUserResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.gabragerecycler.AddRecyclingUser.class.equals(type)){
                
                           return org.example.www.gabragerecycler.AddRecyclingUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.AddRecyclingUserResponse.class.equals(type)){
                
                           return org.example.www.gabragerecycler.AddRecyclingUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.RegisterUser.class.equals(type)){
                
                           return org.example.www.gabragerecycler.RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.RegisterUserResponse.class.equals(type)){
                
                           return org.example.www.gabragerecycler.RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.GetAllRecyclingsByUser.class.equals(type)){
                
                           return org.example.www.gabragerecycler.GetAllRecyclingsByUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse.class.equals(type)){
                
                           return org.example.www.gabragerecycler.GetAllRecyclingsByUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.GetRecyclingByUser.class.equals(type)){
                
                           return org.example.www.gabragerecycler.GetRecyclingByUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.example.www.gabragerecycler.GetRecyclingByUserResponse.class.equals(type)){
                
                           return org.example.www.gabragerecycler.GetRecyclingByUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    