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
public class AccountPartner extends SObject {
	public static SObjectType$<AccountPartner> SObjectType;
	public static SObjectFields$<AccountPartner> Fields;

	public Id AccountFromId;
	public Account AccountFrom;
	public Id AccountToId;
	public Account AccountTo;
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
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id ReversePartnerId;
	public AccountPartner ReversePartner;
	public String Role;
	public Datetime SystemModstamp;

	public AccountPartner clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountPartner clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountPartner clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountPartner clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountPartner clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
