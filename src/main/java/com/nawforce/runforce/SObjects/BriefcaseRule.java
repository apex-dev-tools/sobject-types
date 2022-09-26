/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BriefcaseRule extends SObject {
	public static SObjectType$<BriefcaseRule> SObjectType;
	public static SObjectFields$<BriefcaseRule> Fields;

	public Id BriefcaseId;
	public BriefcaseDefinition Briefcase;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FilterLogic;
	public Id Id;
	public Boolean IsAscendingOrder;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OrderBy;
	public Id ParentRuleId;
	public BriefcaseRule ParentRule;
	public String QueryScope;
	public Integer RecordLimit;
	public String RelationshipField;
	public String RelationshipType;
	public Datetime SystemModstamp;
	public String TargetEntity;

	public BriefcaseRuleFilter[] BriefcaseRuleFilters;
	public BriefcaseRule[] RelatedBriefcaseRules;

	public BriefcaseRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BriefcaseRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
