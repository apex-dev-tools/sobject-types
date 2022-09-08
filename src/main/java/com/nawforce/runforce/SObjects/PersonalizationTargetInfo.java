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
public class PersonalizationTargetInfo extends SObject {
	public static SObjectType$<PersonalizationTargetInfo> SObjectType;
	public static SObjectFields$<PersonalizationTargetInfo> Fields;

	public Id ContainerId;
	public Name Container;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DraftRowId;
	public PersonalizationTargetInfo DraftRow;
	public String GroupName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PublishStatus;
	public Datetime SystemModstamp;
	public String TargetType;
	public String TargetValue;

	public PersonalizationTargetInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationTargetInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationTargetInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationTargetInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersonalizationTargetInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
