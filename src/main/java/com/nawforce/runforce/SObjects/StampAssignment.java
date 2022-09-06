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
public class StampAssignment extends SObject {
	public static SObjectType$<StampAssignment> SObjectType;
	public static SObjectFields$<StampAssignment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id StampId;
	public Stamp Stamp;
	public Id SubjectId;
	public User Subject;
	public Datetime SystemModstamp;

	public StampAssignment clone$() {throw new UnsupportedOperationException();}
	public StampAssignment clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public StampAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public StampAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public StampAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
