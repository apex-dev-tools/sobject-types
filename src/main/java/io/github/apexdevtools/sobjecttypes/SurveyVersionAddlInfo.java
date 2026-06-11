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
public class SurveyVersionAddlInfo extends SObject {
	public static SObjectType$<SurveyVersionAddlInfo> SObjectType;
	public static SObjectFields$<SurveyVersionAddlInfo> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EmailSender;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public String EngagementContextMetadata;
	public Id Id;
	public String InvitationSharingRole;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id SurveyQuestionId;
	public SurveyQuestion SurveyQuestion;
	public Id SurveyVersionId;
	public SurveyVersion SurveyVersion;
	public Datetime SystemModstamp;

	public SurveyVersionAddlInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersionAddlInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersionAddlInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersionAddlInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyVersionAddlInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
