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
public class SurveyEmailBranding extends SObject {
	public static SObjectType$<SurveyEmailBranding> SObjectType;
	public static SObjectFields$<SurveyEmailBranding> Fields;

	public String Body;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id FooterImageId;
	public ContentAsset FooterImage;
	public String FromEmailAddress;
	public Id HeaderImageId;
	public ContentAsset HeaderImage;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String Subject;
	public Datetime SystemModstamp;

	public SurveyEmailBranding clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyEmailBranding clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyEmailBranding clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyEmailBranding clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyEmailBranding clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
