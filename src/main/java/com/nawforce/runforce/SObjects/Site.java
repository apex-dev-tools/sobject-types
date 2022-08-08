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
public class Site extends SObject {
	public static SObjectType$<Site> SObjectType;
	public static SObjectFields$<Site> Fields;

	public Id AdminId;
	public User Admin;
	public com.nawforce.runforce.System.String AnalyticsTrackingCode;
	public com.nawforce.runforce.System.String ClickjackProtectionLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.Integer DailyBandwidthLimit;
	public com.nawforce.runforce.System.Integer DailyBandwidthUsed;
	public com.nawforce.runforce.System.Integer DailyRequestTimeLimit;
	public com.nawforce.runforce.System.Integer DailyRequestTimeUsed;
	public com.nawforce.runforce.System.String Description;
	public Id GuestRecordDefaultOwnerId;
	public User GuestRecordDefaultOwner;
	public Id GuestUserId;
	public User GuestUser;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.Integer MonthlyPageViewsEntitlement;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Boolean OptionsAllowGuestPaymentsApi;
	public com.nawforce.runforce.System.Boolean OptionsAllowGuestSupportApi;
	public com.nawforce.runforce.System.Boolean OptionsAllowHomePage;
	public com.nawforce.runforce.System.Boolean OptionsAllowStandardAnswersPages;
	public com.nawforce.runforce.System.Boolean OptionsAllowStandardIdeasPages;
	public com.nawforce.runforce.System.Boolean OptionsAllowStandardLookups;
	public com.nawforce.runforce.System.Boolean OptionsAllowStandardPortalPages;
	public com.nawforce.runforce.System.Boolean OptionsAllowStandardSearch;
	public com.nawforce.runforce.System.Boolean OptionsBrowserXssProtection;
	public com.nawforce.runforce.System.Boolean OptionsCachePublicVfPagesInProxies;
	public com.nawforce.runforce.System.Boolean OptionsContentSniffingProtection;
	public com.nawforce.runforce.System.Boolean OptionsCookieConsent;
	public com.nawforce.runforce.System.Boolean OptionsEnableFeeds;
	public com.nawforce.runforce.System.Boolean OptionsHasStoredPathPrefix;
	public com.nawforce.runforce.System.Boolean OptionsRedirectToCustomDomain;
	public com.nawforce.runforce.System.Boolean OptionsReferrerPolicyOriginWhenCrossOrigin;
	public com.nawforce.runforce.System.String SiteType;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String Subdomain;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String UrlPathPrefix;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public SiteFeed[] Feeds;
	public SiteHistory[] Histories;
	public DomainSite[] SiteDomainPaths;
	public SiteIframeWhiteListUrl[] SiteIframeWhiteListUrls;

	public Site clone$() {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Site clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
