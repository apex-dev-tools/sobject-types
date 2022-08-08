/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FieldServiceMobileSettings extends SObject {
	public static SObjectType$<FieldServiceMobileSettings> SObjectType;
	public static SObjectFields$<FieldServiceMobileSettings> Fields;

	public com.nawforce.runforce.System.String AscAutomaticMode;
	public com.nawforce.runforce.System.Integer AscCancellationTimerInSec;
	public com.nawforce.runforce.System.String AscCompletedStatus;
	public com.nawforce.runforce.System.String AscOnSiteStatus;
	public com.nawforce.runforce.System.Integer AscRadiusInMeters;
	public com.nawforce.runforce.System.Integer AscTimeLimitationInMin;
	public com.nawforce.runforce.System.String AscTravelStatus;
	public com.nawforce.runforce.System.String BgGeoLocationAccuracy;
	public com.nawforce.runforce.System.Integer BgGeoLocationMinUpdateFreqMins;
	public com.nawforce.runforce.System.String BrandInvertedColor;
	public com.nawforce.runforce.System.String ContrastInvertedColor;
	public com.nawforce.runforce.System.String ContrastPrimaryColor;
	public com.nawforce.runforce.System.String ContrastQuaternaryColor;
	public com.nawforce.runforce.System.String ContrastQuinaryColor;
	public com.nawforce.runforce.System.String ContrastSecondaryColor;
	public com.nawforce.runforce.System.String ContrastTertiaryColor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DefaultListViewDeveloperName;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.String FeedbackPrimaryColor;
	public com.nawforce.runforce.System.String FeedbackSecondaryColor;
	public com.nawforce.runforce.System.String FeedbackSelectedColor;
	public com.nawforce.runforce.System.Integer FutureDaysInDatePicker;
	public com.nawforce.runforce.System.String GeoLocationAccuracy;
	public com.nawforce.runforce.System.Integer GeoLocationMinUpdateFreqMins;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsAssignmentNotification;
	public com.nawforce.runforce.System.Boolean IsDefault;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsDispatchNotification;
	public com.nawforce.runforce.System.Boolean IsSendLocationHistory;
	public com.nawforce.runforce.System.Boolean IsShowEditFullRecord;
	public com.nawforce.runforce.System.Boolean IsTimeSheetEnabled;
	public com.nawforce.runforce.System.Boolean IsTimeZoneEnabled;
	public com.nawforce.runforce.System.Boolean IsUseSalesforceMobileActions;
	public com.nawforce.runforce.System.String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.Integer MetadataCacheTimeDays;
	public com.nawforce.runforce.System.String NavbarBackgroundColor;
	public com.nawforce.runforce.System.String NavbarInvertedColor;
	public com.nawforce.runforce.System.Integer PastDaysInDatePicker;
	public com.nawforce.runforce.System.String PrimaryBrandColor;
	public com.nawforce.runforce.System.String QuickStatusChangeFlowName;
	public com.nawforce.runforce.System.Integer RecordDataCacheTimeMins;
	public com.nawforce.runforce.System.String SecondaryBrandColor;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TimeIntervalSetupMins;
	public com.nawforce.runforce.System.Integer UpdateScheduleTimeMins;

	public AppExtension[] AppExtensions;
	public MobileSettingsAssignment[] MobileSettingsAssignments;

	public FieldServiceMobileSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
