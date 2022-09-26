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
public class RecommendationChangeEvent extends SObject {
	public static SObjectType$<RecommendationChangeEvent> SObjectType;
	public static SObjectFields$<RecommendationChangeEvent> Fields;

	public String AcceptanceLabel;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalId;
	public Id Id;
	public Id ImageId;
	public ContentAsset Image;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id NetworkId;
	public Network Network;
	public String RecommendationKey;
	public String RejectionLabel;
	public String ReplayId;

	public RecommendationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecommendationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecommendationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
