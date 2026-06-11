/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SurveyStyleSetLocalization extends SObject {
	public static SObjectType$<SurveyStyleSetLocalization> SObjectType;
	public static SObjectFields$<SurveyStyleSetLocalization> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String NamespacePrefix;
	public Id ParentId;
	public SurveyStyleSet Parent;
	public Datetime SystemModstamp;
	public String Value;

	public SurveyStyleSetLocalization clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyStyleSetLocalization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyStyleSetLocalization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyStyleSetLocalization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyStyleSetLocalization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
