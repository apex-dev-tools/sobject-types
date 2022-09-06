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
