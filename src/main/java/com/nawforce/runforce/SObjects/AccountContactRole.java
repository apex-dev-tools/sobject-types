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
public class AccountContactRole extends SObject {
	public static SObjectType$<AccountContactRole> SObjectType;
	public static SObjectFields$<AccountContactRole> Fields;

	public Id AccountId;
	public Account Account;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Role;
	public Datetime SystemModstamp;

	public AccountContactRole clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountContactRole clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountContactRole clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountContactRole clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountContactRole clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
