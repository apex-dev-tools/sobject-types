/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EmailServicesAddress extends SObject {
	public static SObjectType$<EmailServicesAddress> SObjectType;
	public static SObjectFields$<EmailServicesAddress> Fields;

	public String AuthorizedSenders;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String EmailDomainName;
	public Id FunctionId;
	public EmailServicesFunction Function;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LocalPart;
	public Id RunAsUserId;
	public User RunAsUser;
	public Datetime SystemModstamp;

	public EmailServicesAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailServicesAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
