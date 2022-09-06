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
public class UserProvAccountStaging extends SObject {
	public static SObjectType$<UserProvAccountStaging> SObjectType;
	public static SObjectFields$<UserProvAccountStaging> Fields;

	public Id ConnectedAppId;
	public ConnectedApplication ConnectedApp;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalEmail;
	public String ExternalFirstName;
	public String ExternalLastName;
	public String ExternalUserId;
	public String ExternalUsername;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LinkState;
	public String Name;
	public Id SalesforceUserId;
	public User SalesforceUser;
	public String Status;
	public Datetime SystemModstamp;

	public UserProvAccountStaging clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserProvAccountStaging clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserProvAccountStaging clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserProvAccountStaging clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserProvAccountStaging clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
