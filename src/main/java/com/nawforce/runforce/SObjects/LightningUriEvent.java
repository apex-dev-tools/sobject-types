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
public class LightningUriEvent extends SObject {
	public static SObjectType$<LightningUriEvent> SObjectType;
	public static SObjectFields$<LightningUriEvent> Fields;

	public String AppName;
	public String ConnectionType;
	public Datetime CreatedDate;
	public String DeviceId;
	public String DeviceModel;
	public String DevicePlatform;
	public String DeviceSessionId;
	public Decimal Duration;
	public Decimal EffectivePageTime;
	public String EffectivePageTimeDeviationErrorType;
	public String EffectivePageTimeDeviationReason;
	public Datetime EventDate;
	public String EventIdentifier;
	public Boolean HasEffectivePageTimeDeviation;
	public Id Id;
	public String LoginKey;
	public String Operation;
	public String OsName;
	public String OsVersion;
	public Datetime PageStartTime;
	public String PageUrl;
	public String PreviousPageAppName;
	public Id PreviousPageEntityId;
	public SObject PreviousPageEntity;
	public String PreviousPageEntityType;
	public String PreviousPageUrl;
	public String QueriedEntities;
	public Id RecordId;
	public SObject Record;
	public String RelatedEventIdentifier;
	public String SdkAppType;
	public String SdkAppVersion;
	public String SdkVersion;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public String UserAgent;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public LightningUriEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LightningUriEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
