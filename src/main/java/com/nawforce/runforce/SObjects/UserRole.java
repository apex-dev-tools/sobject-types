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
public class UserRole extends SObject {
	public static SObjectType$<UserRole> SObjectType;
	public static SObjectFields$<UserRole> Fields;

	public String CaseAccessForAccountOwner;
	public String ContactAccessForAccountOwner;
	public String DeveloperName;
	public Id ForecastUserId;
	public User ForecastUser;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Boolean MayForecastManagerShare;
	public String Name;
	public String OpportunityAccessForAccountOwner;
	public Id ParentRoleId;
	public UserRole ParentRole;
	public Id PortalAccountId;
	public Account PortalAccount;
	public Id PortalAccountOwnerId;
	public User PortalAccountOwner;
	public String PortalType;
	public String RollupDescription;
	public Datetime SystemModstamp;

	public User[] Users;

	public UserRole clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserRole clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserRole clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserRole clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserRole clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
