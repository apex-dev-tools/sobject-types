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
public class UserProvisioningLog extends SObject {
	public static SObjectType$<UserProvisioningLog> SObjectType;
	public static SObjectFields$<UserProvisioningLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Details;
	public String ExternalUserId;
	public String ExternalUsername;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Status;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public Id UserProvisioningRequestId;
	public UserProvisioningRequest UserProvisioningRequest;

	public UserProvisioningLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserProvisioningLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
