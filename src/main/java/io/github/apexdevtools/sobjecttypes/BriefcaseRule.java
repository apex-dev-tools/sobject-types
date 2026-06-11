/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public Boolean OptionsIsRelatedFilesRule;
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
