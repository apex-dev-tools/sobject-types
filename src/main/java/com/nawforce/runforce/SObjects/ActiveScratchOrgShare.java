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
public class ActiveScratchOrgShare extends SObject {
	public static SObjectType$<ActiveScratchOrgShare> SObjectType;
	public static SObjectFields$<ActiveScratchOrgShare> Fields;

	public String AccessLevel;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public ActiveScratchOrg Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public ActiveScratchOrgShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActiveScratchOrgShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
