/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ObjectTerritory2AssignmentRule extends SObject {
	public static SObjectType$<ObjectTerritory2AssignmentRule> SObjectType;
	public static SObjectFields$<ObjectTerritory2AssignmentRule> Fields;

	public String BooleanFilter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ObjectType;
	public Datetime SystemModstamp;
	public Id Territory2ModelId;
	public Territory2Model Territory2Model;

	public ObjectTerritory2AssignmentRuleItem[] ObjectTerritory2AssignmentRuleItems;
	public RuleTerritory2Association[] RuleTerritory2Associations;

	public ObjectTerritory2AssignmentRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2AssignmentRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2AssignmentRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2AssignmentRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectTerritory2AssignmentRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
