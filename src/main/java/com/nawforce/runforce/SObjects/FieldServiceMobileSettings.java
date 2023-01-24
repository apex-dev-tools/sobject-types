/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FieldServiceMobileSettings extends SObject {
	public static SObjectType$<FieldServiceMobileSettings> SObjectType;
	public static SObjectFields$<FieldServiceMobileSettings> Fields;

	public String AscAutomaticMode;
	public Integer AscCancellationTimerInSec;
	public String AscCompletedStatus;
	public String AscOnSiteStatus;
	public Integer AscRadiusInMeters;
	public Integer AscTimeLimitationInMin;
	public String AscTravelStatus;
	public String BgGeoLocationAccuracy;
	public Integer BgGeoLocationMinUpdateFreqMins;
	public String BrandInvertedColor;
	public String ContrastInvertedColor;
	public String ContrastPrimaryColor;
	public String ContrastQuaternaryColor;
	public String ContrastQuinaryColor;
	public String ContrastSecondaryColor;
	public String ContrastTertiaryColor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DefaultListViewDeveloperName;
	public String DeveloperName;
	public String FeedbackPrimaryColor;
	public String FeedbackSecondaryColor;
	public String FeedbackSelectedColor;
	public Integer FutureDaysInDatePicker;
	public String GeoLocationAccuracy;
	public Integer GeoLocationMinUpdateFreqMins;
	public Id Id;
	public Boolean IsAssignmentNotification;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Boolean IsDispatchNotification;
	public Boolean IsLimitedLocTrackingEnabled;
	public Boolean IsScheduleViewResourceAbsences;
	public Boolean IsSendLocationHistory;
	public Boolean IsShowEditFullRecord;
	public Boolean IsTimeSheetEnabled;
	public Boolean IsTimeZoneEnabled;
	public Boolean IsUseSalesforceMobileActions;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Integer MetadataCacheTimeDays;
	public String NavbarBackgroundColor;
	public String NavbarInvertedColor;
	public Integer PastDaysInDatePicker;
	public String PrimaryBrandColor;
	public String QuickStatusChangeFlowName;
	public Integer RecordDataCacheTimeMins;
	public String SecondaryBrandColor;
	public Datetime SystemModstamp;
	public String TimeIntervalSetupMins;
	public Integer UpdateScheduleTimeMins;

	public AppExtension[] AppExtensions;
	public MobileSettingsAssignment[] MobileSettingsAssignments;

	public FieldServiceMobileSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldServiceMobileSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
