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
public class SurveyEngagementContext extends SObject {
	public static SObjectType$<SurveyEngagementContext> SObjectType;
	public static SObjectFields$<SurveyEngagementContext> Fields;

	public String ContextType;
	public String ContextValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id SurveyInvitationId;
	public SurveyInvitation SurveyInvitation;
	public Id SurveyResponseId;
	public SurveyResponse SurveyResponse;
	public Datetime SystemModstamp;

	public SurveyEngagementContextShare[] Shares;

	public SurveyEngagementContext clone$() {throw new java.lang.UnsupportedOperationException();}
	public SurveyEngagementContext clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SurveyEngagementContext clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SurveyEngagementContext clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SurveyEngagementContext clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
