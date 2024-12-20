/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailServicesFunction extends SObject {
	public static SObjectType$<EmailServicesFunction> SObjectType;
	public static SObjectFields$<EmailServicesFunction> Fields;

	public String AddressInactiveAction;
	public Id ApexClassId;
	public ApexClass ApexClass;
	public String AttachmentOption;
	public String AuthenticationFailureAction;
	public String AuthorizationFailureAction;
	public String AuthorizedSenders;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorRoutingAddress;
	public String FunctionInactiveAction;
	public String FunctionName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsAuthenticationRequired;
	public Boolean IsErrorRoutingEnabled;
	public Boolean IsTextAttachmentsAsBinary;
	public Boolean IsTlsRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OverLimitAction;
	public Datetime SystemModstamp;

	public EmailServicesAddress[] Addresses;

	public EmailServicesFunction clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesFunction clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesFunction clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesFunction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesFunction clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
