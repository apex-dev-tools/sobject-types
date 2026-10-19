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
public class EmailRelay extends SObject {
	public static SObjectType$<EmailRelay> SObjectType;
	public static SObjectFields$<EmailRelay> Fields;

	public String AuthType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String E360LifecycleState;
	public String Host;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsHostMxLookupAllowed;
	public Boolean IsRequireAuth;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastQueriedDate;
	public Blob Password;
	public String PlatformType;
	public String Port;
	public String Reason;
	public String RelayHealth;
	public String SpfUpdateElement;
	public Datetime SystemModstamp;
	public String TlsSetting;
	public String Username;

	public EmailDomainFilter[] Filters;

	public EmailRelay clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailRelay clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
