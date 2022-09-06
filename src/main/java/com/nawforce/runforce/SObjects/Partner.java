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
public class Partner extends SObject {
	public static SObjectType$<Partner> SObjectType;
	public static SObjectFields$<Partner> Fields;

	public Id AccountFromId;
	public Account AccountFrom;
	public Id AccountToId;
	public Account AccountTo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public Id ReversePartnerId;
	public Partner ReversePartner;
	public String Role;
	public Datetime SystemModstamp;

	public Partner clone$() {throw new java.lang.UnsupportedOperationException();}
	public Partner clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Partner clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Partner clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Partner clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
