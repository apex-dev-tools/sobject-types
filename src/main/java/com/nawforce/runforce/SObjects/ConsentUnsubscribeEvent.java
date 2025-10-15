/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConsentUnsubscribeEvent extends SObject {
	public static SObjectType$<ConsentUnsubscribeEvent> SObjectType;
	public static SObjectFields$<ConsentUnsubscribeEvent> Fields;

	public String BusinessBrand;
	public String CommSubscription;
	public String CommSubscriptionChannelType;
	public String ContactPoint;
	public String ContactPointValue;
	public String Correlation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime DateTime;
	public String EngagementChannelType;
	public String EventUuid;
	public Boolean IsUnsubscribeAll;
	public String PartyRole;
	public String PreferenceFormName;
	public String PrivacyConsentStatus;
	public String ReplayId;

	public ConsentUnsubscribeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConsentUnsubscribeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
