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
public class ExpressionSetView extends SObject {
	public static SObjectType$<ExpressionSetView> SObjectType;
	public static SObjectFields$<ExpressionSetView> Fields;

	public String Description;
	public String DurableId;
	public String ExpressionSetDetails;
	public Boolean HasContextDefinitionRef;
	public Id Id;
	public Boolean IsExecutable;
	public Boolean IsTemplate;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String NamespacePrefix;
	public String UsageType;
	public String UsageTypeLabel;

	public ExpressionSetView clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExpressionSetView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
