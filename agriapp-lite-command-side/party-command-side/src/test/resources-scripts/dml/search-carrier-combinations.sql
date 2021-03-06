SELECT 
			OD.VCOMOD_PRM_CXR,
       		-- ORIGIN
       		OD.VCOMOD_VLR_ORIGIN,
       		OD.VCOMOD_VLR_ORIGIN_COUNTRY,
       		OD.VCOMOD_VLR_ORIGIN_REGION,
       		-- DESTINO
       		OD.VCOMOD_VLR_DEST,
       		OD.VCOMOD_VLR_DEST_COUNTRY,
       		OD.VCOMOD_VLR_DEST_REGION,
       		-- CABINA
       		OD.VCOMOD_PRM_CABIN,
       		--
       		CF.VCCCCF_PRM_CXR,
       		CF.VCCCCF_PRM_CABIN,
       		CF.VCCCCF_PRM_CLASS,
       		CF.VCCCCF_PRM_FAMILY,
            --
            OD.VCOMOD_NMR_TARIF_VIA_AT,
            OD.VCOMOD_NMR_ROUTING,
            
            OD.VCOMOD_PRM_CURRENCY1,
            OD.VCOMOD_NMR_MIN_AMOUNT1,
            OD.VCOMOD_NMR_MAX_AMOUNT1,
                       
            OD.VCOMOD_PRM_CURRENCY2,
            OD.VCOMOD_NMR_MIN_AMOUNT2,
            VCOMOD_NMR_MAX_AMOUNT2
            
            
		FROM VCOMOD OD
		LEFT JOIN VCCCCF CF 
		   ON REGEXP_LIKE (CF.VCCCCF_PRM_CXR, REPLACE(OD.VCOMOD_PRM_CXR,',','|')) AND
         	  OD.VCOMOD_PRM_CABIN = CF.VCCCCF_PRM_CABIN
		WHERE OD.VCOMOD_VLR_ORIGIN LIKE 'SCL' AND
			  OD.VCOMOD_VLR_DEST LIKE 'MIA'  AND
			  CF.TECONF_ID LIKE 'DOM PE' AND
			  --
			  OD.VCOMOD_FLG_ACTIVE LIKE 'Y' AND CF.VCCCCF_FLG_ACTIVE LIKE 'Y';