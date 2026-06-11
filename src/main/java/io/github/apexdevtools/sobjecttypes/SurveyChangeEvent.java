/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SurveyChangeEvent extends SObject {
	public static SObjectType$<SurveyChangeEvent> SObjectType;
	public static SObjectFields$<SurveyChangeEvent> Fields;

	public Id ActiveVersionId;
	public SurveyVersion ActiveVersion;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LatestVersionId;
	public SurveyVersion LatestVersion;
	public String Name;
	public String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SurveyType;
	public Integer TotalVersionsCount;

	public SurveyChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
