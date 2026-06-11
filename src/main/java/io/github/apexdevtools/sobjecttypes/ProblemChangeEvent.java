/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProblemChangeEvent extends SObject {
	public static SObjectType$<ProblemChangeEvent> SObjectType;
	public static SObjectFields$<ProblemChangeEvent> Fields;

	public String Category;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public String Impact;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Id ParentProblemId;
	public Problem ParentProblem;
	public String Priority;
	public String PriorityOverrideReason;
	public String ProblemNumber;
	public String ReplayId;
	public Datetime ResolutionDateTime;
	public String ResolutionSummary;
	public Id ResolvedById;
	public User ResolvedBy;
	public String RootCauseSummary;
	public String Status;
	public String SubCategory;
	public String Subject;
	public String Urgency;

	public ProblemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProblemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProblemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProblemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProblemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
