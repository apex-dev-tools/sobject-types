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
public class LeadShare extends SObject {
	public static SObjectType$<LeadShare> SObjectType;
	public static SObjectFields$<LeadShare> Fields;

	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LeadAccessLevel;
	public Id LeadId;
	public Lead Lead;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public LeadShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public LeadShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LeadShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LeadShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LeadShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
