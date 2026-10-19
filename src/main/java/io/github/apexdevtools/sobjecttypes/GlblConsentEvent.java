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
public class GlblConsentEvent extends SObject {
	public static SObjectType$<GlblConsentEvent> SObjectType;
	public static SObjectFields$<GlblConsentEvent> Fields;

	public String AdditionalConsentOptions;
	public String AdditionalConsentParameters;
	public String AdditionalPartition;
	public String Brand;
	public String BrandRecord;
	public Datetime ConsentCaptureDateTime;
	public String ConsentCaptureSource;
	public String ConsentCaptureSourceType;
	public String ConsentCapturedEngagementChannelRecord;
	public String ConsentCapturedEngagementChannelValue;
	public Datetime ConsentDoiCapture;
	public Datetime ConsentEffectiveFrom;
	public Datetime ConsentEffectiveTo;
	public String ConsentGiver;
	public String ConsentGiverRecord;
	public String ConsentMethod;
	public String ConsentPurpose;
	public String ConsentStatus;
	public String ConsentType;
	public String ContactPoint;
	public String ContactPointSourceRecord;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSubject;
	public String DataSubjectRecord;
	public String DataSubjectSourceRecord;
	public String DataUsePurpose;
	public String DataUsePurposeRecord;
	public String EngagementChannel;
	public String EngagementChannelSourceRecord;
	public String EventUuid;
	public String GlobalConsentDefinition;
	public String GlobalConsentKey;
	public String ReplayId;
	public String ResidencyCountry;
	public String ResidencyStateProvince;

	public GlblConsentEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GlblConsentEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GlblConsentEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GlblConsentEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GlblConsentEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
