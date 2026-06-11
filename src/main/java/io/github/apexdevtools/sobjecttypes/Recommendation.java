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
public class Recommendation extends SObject {
	public static SObjectType$<Recommendation> SObjectType;
	public static SObjectFields$<Recommendation> Fields;

	public String AcceptanceLabel;
	public String ActionReference;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalId;
	public Id Id;
	public Id ImageId;
	public ContentAsset Image;
	public Boolean IsActionActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id NetworkId;
	public Network Network;
	public String RecommendationKey;
	public String RecommendationMode;
	public Decimal RecommendationScore;
	public String RejectionLabel;
	public Datetime SystemModstamp;

	public Recommendation clone$() {throw new java.lang.UnsupportedOperationException();}
	public Recommendation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Recommendation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Recommendation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Recommendation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
