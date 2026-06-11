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
public class OnbrdDataObjGrpRecVld extends SObject {
	public static SObjectType$<OnbrdDataObjGrpRecVld> SObjectType;
	public static SObjectFields$<OnbrdDataObjGrpRecVld> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OnboardingDataObjGrpVerId;
	public OnboardingDataObjGrpVer OnboardingDataObjGrpVer;
	public String RootRecord;
	public String RootRecordObject;
	public Datetime SystemModstamp;
	public Datetime ValidityDate;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public GenericVisitTaskContext[] GVTaskContexts;
	public OnbrdDataObjGrpRecVldCalc[] OnbrdDataObjGrpRecVldCalcs;
	public OpenActivity[] OpenActivities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public OnbrdDataObjGrpRecVld clone$() {throw new java.lang.UnsupportedOperationException();}
	public OnbrdDataObjGrpRecVld clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OnbrdDataObjGrpRecVld clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OnbrdDataObjGrpRecVld clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OnbrdDataObjGrpRecVld clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
