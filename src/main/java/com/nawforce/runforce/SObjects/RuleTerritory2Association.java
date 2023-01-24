/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class RuleTerritory2Association extends SObject {
	public static SObjectType$<RuleTerritory2Association> SObjectType;
	public static SObjectFields$<RuleTerritory2Association> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInherited;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RuleId;
	public ObjectTerritory2AssignmentRule Rule;
	public Datetime SystemModstamp;
	public Id Territory2Id;
	public Territory2 Territory2;

	public RuleTerritory2Association clone$() {throw new java.lang.UnsupportedOperationException();}
	public RuleTerritory2Association clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RuleTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RuleTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RuleTerritory2Association clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
